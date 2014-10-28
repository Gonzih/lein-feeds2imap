(ns leiningen.feeds2imap
  (:require [feeds2imap.core]))

(defn  ^:no-project-needed feeds2imap
  "Pull RSS/Atom feeds to your IMAP folders.

  Usage: lein feeds2imap <command>

  Available commands:
    pull - fetch feeds and push them to IMAP
    auto - automatically run pull every 60 minutes (delay can be conrolled by DELAY env var)
    show - show list of feeds
    opml2clj <file> - convert OMPL file to feeds2imap format
    opml2clj <file1> <file2> - convert OMPL file to feeds2imap format and store it in <file2>
    add <folder> <url> - add <url> to feeds, put in under <folder>

    GPG based commands:
    imap encrypt - encrypt your imap configuration using gpg
    imap decrypt - decrypt your imap configuration using gpg

    GPG commands require FEEDS_ENC_RECIPIENT env var to be set to the email address of the pub key that should be used."
  [_ & args]
  (apply feeds2imap.core/-main args))
