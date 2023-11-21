<script setup>
import { RouterView } from 'vue-router';


</script>

<template>
<div class="d-flex">
  <router-link :to="{name:'home'}" >Home</router-link>
  
  <router-link :to="{name:'login'}">Login</router-link>
  
  <router-link :to="{name:'dashboard'}">Dashboard</router-link>

</div>

<router-view/>

</template>

<style scoped>

</style>
