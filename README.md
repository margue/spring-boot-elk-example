# Sprin Boot ELK example

* Dockered Spring Boot App
  * logback-spring.xml configured using LogstashTcpSocketAppender to transfer log statements to a logstash instance
  * executed in a Docker container
* ELK Docker container
  * Logstash
    * receiving log statements from the spring boot app via tcp
    * persisting them in elasticsearch
  * Elasticsearch
    * [indexed log store](http://localhost:9200/_search?pretty)
  * Kibana
    * [Dashboard](http://localhost:5601/app/kibana) to discover log data stored in elasticsearch
* All containers linked via Docker network

## Overview
  
![alt text][overview]

[overview]: doc/docker-overview.png "Architectural overview"

## How to run it?
1. build the docker images by executing `mvn clean install`
2. startup Docker containers by executing `docker-compose up`
3. create an index pattern, f.e. `logstash-*`, in [Kibana dashboard](http://localhost:5601/app/kibana)

### Troubleshooting
1. Docker time out of sync with OSX host after system sleep
   * [Time drift in Moby VM and containers caused by system sleep](https://github.com/docker/for-mac/issues/17)
   * [Docker time outof sync with osx host](https://github.com/docker/for-mac/issues/1260)

## References
These were very helpful resources when building this small exapmle:

* https://elk-docker.readthedocs.io
* https://blog.codecentric.de/2016/07/spring-boot-apache-cxf-logging-monitoring-logback-elasticsearch-logstash-kibana/
* https://blog.codecentric.de/en/2014/10/log-management-spring-boot-applications-logstash-elastichsearch-kibana/
* https://springframework.guru/using-logback-spring-boot/
* https://github.com/logstash/logstash-logback-encoder
* https://spring.io/guides/gs/scheduling-tasks/
