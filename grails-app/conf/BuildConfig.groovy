// See http://github.com/grails/grails/commit/6016e1474dd0ecbc07ca7b6de45923c7f7e0ceda#diff-2 and
// http://github.com/grails/grails/blob/master/grails/src/grails/grails-app/conf/BuildConfig.groovy

grails.project.dependency.resolution = {
  inherits( "global" ) {
    excludes 'ehcache'
  }
  dependencies {
    // 2.4.1 is not in the maven central repo.
    // See http://markmail.org/message/w4jvcxfazskntxwv#query:oscache%202.4.1%20maven+page:1+mid:wfcasi65a4klsff3+state:results
    //runtime ("opensymphony:oscache:2.4.1") {
    runtime ("opensymphony:oscache:2.4") {
      excludes 'jms', 'commons-logging', 'servlet-api'
    }
  }
}
