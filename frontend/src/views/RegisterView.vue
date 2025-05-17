<script setup>
import avatarImage from '../assets/avatar.png'
</script>

<template>
  <div id="app">
    <main class="content">
      <div class="left-column">
        <img :src="avatarImage" alt="User Avatar" class="dog-img" />
        <div class="contact-section">
          <h4>Already have an account?</h4>
          <p><a href="#">Log In</a></p>
        </div>
      </div>

      <div class="right-column">
        <h2>Create Account</h2>
        <form>
          <label>Full Name:</label>
          <input type="text" placeholder="ex. Popa Ioana" />

          <label>Email Address:</label>
          <input type="email" placeholder="example@email.com" />

          <label>Phone Number:</label>
          <input type="text" placeholder="07xxxxxxxx" />

          <label>Password:</label>
          <input type="password" placeholder="password" />

          <label>Confirm Password:</label>
          <input type="password" placeholder="password" />

          <label>Register as:</label>
          <div class="role-select">
            <button type="button" class="active">✓ User</button>
            <button type="button">Admin</button>
          </div>

          <div class="captcha-container">
            <input type="checkbox" id="human" />
            <label for="human">I am human</label>
          </div>

          <button type="submit" class="btn-contact">Create Account</button>
        </form>
      </div>
    </main>
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
  max-width: none;
  margin: 0 auto;
  box-sizing: border-box;
}
</style>

<style scoped>

.right-column {
  flex: 2;
}

.right-column h2 {
  margin-bottom: 1.5rem;
}

.right-column form {
  display: flex;
  flex-direction: column;
}

.right-column label {
  margin-top: 1rem;
  font-weight: 500;
}

.right-column input[type="text"],
.right-column input[type="email"],
.right-column input[type="password"] {
  padding: 0.5rem 1rem;
  border-radius: 8px;
  border: 1px solid #ccc;
  margin-top: 0.3rem;
  font-size: 0.95rem;
  background-color: #f9f9f9;
}

.role-select {
  display: flex;
  gap: 1rem;
  margin-top: 0.5rem;
}

.role-select button {
  flex: 1;
  padding: 0.4rem;
  border: 1px solid #ccc;
  background-color: #f2f2f2;
  border-radius: 8px;
  cursor: pointer;
  font-weight: 500;
}

.role-select .active {
  background-color: #d7c4f2;
  border-color: #a77dfa;
}

/* CAPTCHA section */
.captcha-container {
  display: flex;
  align-items: center;
  gap: 1rem;
  margin-top: 1rem;
  flex-wrap: wrap;
}

.btn-contact {
  background-color: #4c6ef5;
  color: white;
  padding: 0.6rem 1.2rem;
  border: none;
  border-radius: 20px;
  margin-top: 1.5rem;
  font-weight: 500;
  cursor: pointer;
  width: 100%;
  transition: background-color 0.2s;
}

.btn-contact:hover {
  background-color: #3b5bdb;
}

.dog-img {
  width: 100%;
  max-width: 300px;
  border-radius: 50%;
}

.contact-section {
  margin-top: 2rem;
  text-align: center;
}
</style>
