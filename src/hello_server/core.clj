(ns hello-server.core
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:require [clojure.data.json :as json])
  (:use [ring.middleware.params]
        [ring.util.servlet :only [defservice]]
        [compojure.core]))

(defroutes app
  (POST "/hello" ctx (json/write-str {:result "hello world"})))

(def wrapped-app
  (-> app
      wrap-params))

(defservice wrapped-app)
