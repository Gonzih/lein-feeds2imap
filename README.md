# lein-feeds2imap

A Leiningen plugin for feeds2imap.clj project.

[![Clojars Project](http://clojars.org/lein-feeds2imap/latest-version.svg)](http://clojars.org/lein-feeds2imap)

## Usage

Use this for user-level plugins:

Put `[lein-feeds2imap "version"]` into the `:plugins` vector of your
`:user` profile, or if you are on Leiningen 1.x do `lein plugin install
lein-feeds2imap version`.


    $ lein feeds2imap --help

## Upgrading from 0.1.+ version

* Since feeds2imap version 0.3.0 format of cache changed, please delete your existing `~/.config/feeds2imap.clj/read-items.clj` file in case of any issues

## License

Copyright © 2014 Max Gonzih gonzih @ gmail.com

Distributed under the Eclipse Public License, the same as Clojure.
