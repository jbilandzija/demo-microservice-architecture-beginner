import Vue from 'vue';
import VueRouter from 'vue-router';
import App from './App.vue';
import TTable from 'vue-tailwind/src/components/TTable.vue';
import {routes} from './routes';

Vue.config.productionTip = false;

Vue.use(VueRouter);
Vue.use(TTable);

const router = new VueRouter({
  base: process.env.BASE_URL,
  routes
});

new Vue({
  render: h => h(App),
  router
}).$mount('#app');
