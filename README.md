# 測試專案
[![works badge](https://cdn.jsdelivr.net/gh/nikku/works-on-my-machine@v0.2.0/badge.svg)](https://github.com/nikku/works-on-my-machine)

## 問題處理

1. 出現 WARN - No URLs will be polled as dynamic configuration sources.
因為 spring cloud 新版有用到 [Netflix-Archaius](https://github.com/Netflix/archaius/wiki/Getting-Started) 做設定檔動態載入的元件, 預設就是會檢查 config.properties 是否存在, 暫時無解, 放個空白檔案就不會出現警告.