<template>
  <div id="app">
    <Navigation></Navigation>
    <router-view class="pb-20"></router-view>
  </div>
</template>

<script>
import Navigation from "./components/navigation/Navigation.vue";
import "@/assets/css/tailwind.css";

export default {
  name: 'App',
  components: {
    Navigation
  }
}
</script>

<style>
</style>
