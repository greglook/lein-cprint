# lein-cprint

Pretty-prints a representation of the project map much like `lein-pprint`,
but uses [Puget](https://github.com/greglook/puget) to colorize the output.

## Usage

Add `[lein-cprint "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your
`:user` profile.

    $ lein cprint

You can also pass arguments to the command to select specific keys from the
project definition:

    $ lein cprint :repositories :deploy-repositories

## License

This is free and unencumbered software released into the public domain.
See the UNLICENSE file for more information.
