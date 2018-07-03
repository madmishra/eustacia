module.exports = {
  // This is the "main" file which should include all other modules
  entry: './app.js',
  // Where should the compiled file go?
  output: {
  	// To the `dist` folder
    path: './dist',
    // With the filename `build.js` so it's dist/build.js
    filename: 'build.js'
  }, // how modules should be transformed
  resolve: {
  alias: {
    vue: 'vue/dist/vue.js'
  }
},
  module: {
    loaders: [
      // process *.vue files using vue-loader
      { test: /\.vue$/, loader: 'vue' },
      // process *.js files using babel-loader
      // the exclude pattern is important so that we don't
      // apply babel transform to all the dependencies!
      { test: /\.js$/, loader: 'babel', exclude: /node_modules/ }
    ]
  },
  // configure babel-loader.
  // this also applies to the JavaScript inside *.vue files
  babel: {
    presets: ['es2015'],
    plugins: ['transform-runtime']
  }
}