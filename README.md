## Requirements

- Node & NPM (5.2+)

## Usage

Ensure node modules are installed locally:

``` bash
npm install
```

Start development server, served at `localhost:8080`:

``` bash
npx shadow-cljs watch main
```

Start web test runner, served at `localhost:8081`:

``` bash
npx shadow-cljs watch test
```

Start Sass compilation and watch for changes:

``` bash
npx sass --watch src/sass:public/assets/styles
```
