const env = "dev";
const environment = {
    env:env,
    apiURL: env === 'dev' ? 'http://localhost:8000/' : ''
}

export default environment