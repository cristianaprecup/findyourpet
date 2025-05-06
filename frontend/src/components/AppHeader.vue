<!-- components/AppHeader.vue -->
<template>
  <header class="header">
    <h1>FindYourPet</h1>
    <nav>
      <a href="/">Home</a>
      <a href="/login">Login</a>
      <a href="/register">Register</a>
    </nav>
    <input type="text" placeholder="Search..." />
  </header>
</template>

<style>
.header {
  background: #f0f0f0;
  padding: 1rem;
  display: flex;
  justify-content: space-between;
  align-items: center;
}
nav a {
  margin: 0 10px;
}
</style>
