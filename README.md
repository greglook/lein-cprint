lein-cprint
===========

This Leiningen plugin pretty-prints a representation of the project map much
like `lein-pprint`, but uses [Puget](https://github.com/greglook/puget) to
colorize the output.

## Usage

Releases are published on Clojars. To use the latest version with Leiningen, add
the following plugin to your user profile:

[![Clojars Project](http://clojars.org/lein-cprint/lein-cprint/latest-version.svg)](http://clojars.org/lein-cprint/lein-cprint)

Now you can call the plugin to show the whole project map:

```shell
$ lein cprint
```

You can also pass arguments to select specific keys from the project map:

```shell
$ lein cprint :repositories :deploy-repositories
```

Vector arguments can be used to get nested elements from the project:

```shell
$ lein cprint '[:profiles :dev :dependencies]'
```

## License

This is free and unencumbered software released into the public domain.
See the UNLICENSE file for more information.
