module.exports = {
    outputDir: "../../target/classes/static",
    indexPath: 'frontend.html',
    lintOnSave: 'default',
    devServer: {
        proxy: {
            '/': {
                target: 'http://localhost:9088',
                ws: true,
                changeOrigin: true
            }
        },
        overlay: {
            warnings: true,
            errors: true
        },
        watchOptions: {
            poll: 1000
        }
    }
}
