/**
 * 头js，在页面和框架加载之前引入
 *
 * @auther wxyz 2016-10-12_10:41
 * @since 0.1
 */
var requireConfig = {
    baseUrl: 'scripts',
    paths: {
        jquery: 'libs/jquery/jquery-2.2.4.min',
        bootstrap: 'libs/bootstrap/3.3.5/js/bootstrap.min',
        vue: 'libs/vue/vue-1.0.26.min'
    },
    shim: {
        bootstrap: {
            deps: ['jquery']
        },
        vue: {
            deps: ['jquery']
        }
    }
};