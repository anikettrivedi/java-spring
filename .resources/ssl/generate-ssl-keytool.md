#### PKCS12 keystore format
keytool -genkeypair -alias ssltest -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore sslkeystore.p12 -validity 365

#### JKS keystore format
keytool -genkeypair -alias ssltest -keyalg RSA -keysize 2048 -keystore sslkeystore.jks -validity 365
