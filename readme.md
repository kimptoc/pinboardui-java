

STUFF
- thin wrapper/new ui for https://pinboard.in/api/
- to run/debug, use Application.main
- then go to this page http://localhost:8080/
- need to pass query params user, token and optional tag
- pure server side/spring mvc & jQuery for now. No react/Vue.js etc!

RUN IT
- use application.properties to override settings, see template
mvn spring-boot:run

or

mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dserver.port=8090 -Dhttp.proxyHost=localhost -Dhttp.proxyPort=8888 -Dpinboard.root.url=http://pb-api.kimptoc.net/ "

TODO
- take name param to limit link for given tag
- format output of links by tag
- ask user for api key (via auth or sep form?)
- see scala/play app for existing features
- see scala/play app for new features it wanted... relevant
