OpenDJ is an [LDAPv3](http://tools.ietf.org/html/rfc4510) compliant directory service, which has been developed 
for the Java platform, providing a high performance, highly available, and secure store for the identities managed 
by your organization. Its easy installation process, combined with the power of the Java platform makes OpenDJ
the simplest, fastest directory to deploy and manage.

An open source, lightweight, embeddable directory that can easily share real-time customer, device, and user identity data across enterprise, cloud, social, and mobile environments.
* Massive data scale and high availability providings developers with ultra-lightweight ways to access identity data
* High Performance - ms response times & tens of thousands of w/r per sec
* Multi Master replication for high availability

As well as the expected LDAP access OpenDJ lets you access directory data as JSON resources over HTTP making it super convenient for web and phone apps.

## License
This project is licensed under the Common Development and Distribution License (CDDL). The following text applies to 
both this file, and should also be included in all files in the project.


Java 1.8+ required

## How-to build
For windows use:
```bash
git config --system core.longpaths true
```

```bash
git clone https://github.com/GluuFederation/gluu-opendj4.git
mvn clean install -f gluu-opendj4/opendj-sdk
mvn clean install -f gluu-opendj4
```

## How-to run after build
```bash
cd OpenDJ/opendj-server-legacy/target/package/opendj
./setup
bin/start-ds
bin/stop-ds
```

## Thanks
* Sun OpenDS
* Oracle OpenDS
* Forgerock OpenDJ
