(ns leiningen.feeds2imap
  (:require [feeds2imap.core]
            [clojure.tools.logging :refer [info]])
  (:import [java.util Properties]
           [org.apache.log4j PropertyConfigurator]))

(defn configure-logger! []
  (let [properties (Properties.)]
    (doto properties
        (.setProperty "log4j.rootLogger", "INFO, A1")
        (.setProperty "log4j.appender.A1" "org.apache.log4j.ConsoleAppender")
        (.setProperty "log4j.appender.A1.layout" "org.apache.log4j.PatternLayout")
        (.setProperty "log4j.appender.A1.layout.ConversionPattern" "%m%n"))
    (PropertyConfigurator/configure properties)))

(defn  ^:no-project-needed feeds2imap
  "Pull RSS/Atom feeds to your IMAP folders.

  Usage: lein feeds2imap <command>

  Available commands:
    pull - fetch feeds and push them to IMAP
    auto - automatically run pull every 60 minutes (delay can be conrolled by DELAY env var)
    show - show list of feeds
    opml2clj <file> - convert OMPL file to feeds2imap format
    opml2clj <file1> <file2> - convert OMPL file to feeds2imap format and store it in <file2>
    add <folder> <url> - add <url> to feeds, put in under <folder>"
  [_ & args]
  (configure-logger!)
  (info "Doing stuff")
  (apply feeds2imap.core/-main args))
