exec java -Xms512m -Xmx1024m -jar /space-gateway.jar \
--spring.cloud.consul.host=$consul_host \
--spring.cloud.consul.port=$consul_port \
--spring.cloud.consul.config.acl-token=$acl_token \
--spring.cloud.consul.discovery.acl-token=$acl_token