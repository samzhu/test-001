# Demo how use Springboot & GoogleContainerTools & Github Actions & New Relic
[![works badge](https://cdn.jsdelivr.net/gh/nikku/works-on-my-machine@v0.2.0/badge.svg)](https://github.com/nikku/works-on-my-machine)

## Springboot
1. 出現 WARN - No URLs will be polled as dynamic configuration sources.
因為 spring cloud 新版有用到 [Netflix-Archaius](https://github.com/Netflix/archaius/wiki/Getting-Started) 做設定檔動態載入的元件, 預設就是會檢查 config.properties 是否存在, 暫時無解, 放個空白檔案就不會出現警告.

## New Relic
1. [Install the Java agent](https://docs.newrelic.com/docs/agents/java-agent/installation/install-java-agent)
2. [Install New Relic Java agent for Docker](https://docs.newrelic.com/docs/agents/java-agent/additional-installation/install-new-relic-java-agent-docker)

## CI
1. [Github Actions environment variables](https://help.github.com/en/actions/configuring-and-managing-workflows/using-environment-variables)
2. [Set up your GitHub Actions workflow with a specific version of Java](https://github.com/actions/setup-java#apache-maven-with-a-settings-path)
3. [Distroless Java version](https://github.com/GoogleContainerTools/distroless/tree/master/java)

## Start application
1. Replace ${YOUR_NEW_RELIC_LICENSE_KEY} in docker-compose.yml
2. docker-compose up -d