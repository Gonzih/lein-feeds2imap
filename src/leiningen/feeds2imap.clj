(ns leiningen.feeds2imap
  (:require [feeds2imap.core]))

(defn feeds2imap [project & args]
  (apply feeds2imap.core/-main args))
