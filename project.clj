(def app-engine-version (slurp "gae-version"))

(defproject hello-server "0.1.0-SNAPSHOT"
  :license {:name "jank license"
            :url "https://upload.jeaye.com/jank-license"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha13"]
                 [org.clojure/data.json "0.2.6"]
                 [compojure "1.5.2"]
                 [ring/ring-jetty-adapter "1.5.1"]
                 [ring/ring-core "1.5.1"]
                 [com.google.appengine/appengine-api-1.0-sdk ~app-engine-version]
                 [com.google.appengine/appengine-api-labs ~app-engine-version]]
  :plugins [[lein-ring "0.9.7" :exclusions [org.clojure/clojure]]
            [lein-localrepo "0.5.3"]]
  :ring {:handler hello-server.core/wrapped-app}
  :target-path "target/%s"
  :source-paths ["src"]
  :resource-paths ["resources"]
  :profiles {:uberjar {:aot :all}})
