<template>
  <div class="page">
    <div class="login-container">
      <h2>Login</h2>
      <form>
        <label for="email">Email or phone:</label>
        <input id="email" type="text" placeholder="example@email.com" />

        <label for="password">Password:</label>
        <input id="password" type="password" placeholder="password" />

        <a href="#">Forgot your password?</a>

        <div class="buttons">
          <button type="submit">Log In</button>
          <a href="#" class="create-account-link">Create an account</a>
        </div>
      </form>
    </div>
  </div>
</template>


<style scoped>
.login-container {
  width: 100%;
  max-width: 400px;
  padding: 30px;
  background: white;
  border-radius: 16px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}


.login-container label {
  display: block;
  margin-bottom: 5px;
  text-align: left;
}

.login-container input {
  display: block;
  width: 100%;
  margin-bottom: 15px;
  padding: 10px;
  border: 1px solid #ddd;
  border-radius: 20px;
  background: #DCDCDC;
}

.login-container h2 {
  text-align: left;
  margin-bottom: 20px;
}

.login-container .buttons {
  display: flex;
  justify-content: space-between;
}

.login-container button {
  padding: 2px 40px;
  background: #4f46e5;
  color: white;
  border: none;
  border-radius: 20px;
}

.login-container .create-account-link {
  display: inline-block;
  color: #4f46e5;
  text-decoration: none;
  padding: 8px;
}

.login-container .create-account-link:hover {
  text-decoration: underline;
}

.login-container a {
  display: block;
  margin-bottom: 15px;
  color: #4f46e5;
  text-decoration: none;
  text-align: left;
}

.login-container a:hover {
  text-decoration: underline;
}

.page {
  background-color: #f7f7f7;
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  padding: 20px;
  box-sizing: border-box;
}


</style>
