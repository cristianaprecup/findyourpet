<template>
  <div class="container mt-5">
    <h2>Mesaj de la backend:</h2>
    <p>{{ message }}</p>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'

const message = ref('')

onMounted(async () => {
  try {
    const res = await fetch('http://localhost:2222/api/hello')
    message.value = await res.text()
  } catch (e) {
    message.value = 'Eroare la conectare'
  }
})
</script>
