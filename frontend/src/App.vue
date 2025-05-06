<script setup>
import Announcements from "./components/Announcements.vue";
import AppHeader from './components/AppHeader.vue'
</script>

<template>
  <div class="app-container">
    < <Announcements />
    <AppHeader />
    <router-view />
  </div>
</template>

<style>
html, body {
  margin: 0;
  padding: 0;
  height: 100%;
  background-color: #f7f7f8;
}

#app {
  max-width: 1440px;
  margin: 0 auto;
  padding: 2rem;
  box-sizing: border-box;
}
</style>
