provider "aws" {
  region = "us-east-1"
}

resource "aws_security_group" "securitygroup" {
  name = "securitygroup"
  description = "Permitir acesso HTTP, SSH e acesso a internet"
  ingress {
    from_port = 80
    protocol  = "tcp"
    to_port   = 80
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    from_port = 22
    protocol  = "tcp"
    to_port   = 22
    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    from_port = 0
    protocol  = "tcp"
    to_port   = 60000
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_key_pair" "keypair" {
  key_name = "terraform-keypair"
  public_key = file("~/.ssh/id_ed25519.pub")
}

resource "aws_instance" "servidor" {
  ami = "ami-07caf09b362be10b8"
  instance_type = "t2.nano"
  user_data = file("user_data.sh")
  key_name = aws_key_pair.keypair.key_name
  vpc_security_group_ids = [aws_security_group.securitygroup.id]
}