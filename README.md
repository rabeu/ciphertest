# ciphertest
SpringBoot test with some Cipher code fun.

# Testing
To test, go to the main dir and run
$ ./gradlew test

# Docker
The docker image has been saved as marceuciphertest.tar
I don't like to push binary files into git but this is just a demo and an easier way to transfer a 100+ Mb file than sending in an email.

To load the docker image
docker load -i marceuciphertest.tar

To run the docker image
$ docker run -p 8080:8080 -t marceu/marceucipherdockerimage

# Public link for Postman Collection for the 4 REST tests
https://www.postman.com/collections/eb4038152bb23a42590a
