# lein-feeds2imap[ ![License](http://img.shields.io/:license-mit-blue.svg)](https://github.com/Gonzih/lein-feeds2imap/blob/master/LICENSE.md) [![Dependencies Status](http://jarkeeper.com/Gonzih/lein-feeds2imap/status.svg)](https://jarkeeper.com/Gonzih/lein-feeds2imap) [![Downloads](https://jarkeeper.com/Gonzih/lein-feeds2imap/downloads.svg)](https://jarkeeper.com/Gonzih/lein-feeds2imap)

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

Copyright © 2013-2016 Max Gonzih gonzih @ gmail.com

Distributed under the MIT license.
