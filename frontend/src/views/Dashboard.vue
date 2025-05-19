<template>
  <div class="admin-dashboard">
    <!-- Main Content -->
    <main class="main-content">
      <!-- Admin Profile -->
      <div class="admin-profile">
        <div class="admin-avatar">
          <img src="https://randomuser.me/api/portraits/men/32.jpg" alt="Admin Avatar" />
        </div>
        <h1 class="admin-title">Admin Dashboard</h1>
      </div>

      <!-- New Posts Section -->
      <section class="new-posts-section">
        <h2 class="section-title">New Posts</h2>

        <div class="posts-list">
          <div v-for="(post, index) in pendingPosts" :key="index" class="post-card">
            <div class="post-image">
              <img :src="post.image" :alt="post.description" />
            </div>
            <div class="post-content">
              <p class="post-description">{{ post.description }}</p>
              <div class="post-features">
                <strong>features:</strong> {{ post.features }}
              </div>
              <div class="post-location">
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="location-icon">
                  <path d="M21 10c0 7-9 13-9 13s-9-6-9-13a9 9 0 0 1 18 0z" />
                  <circle cx="12" cy="10" r="3" />
                </svg>
                <span>{{ post.location }}</span>
              </div>
              <div class="post-date">{{ post.date }}</div>
            </div>
            <div class="post-actions">
              <button
                class="approve-button"
                @click="approvePost(post.id)"
                :class="{ 'processing': post.processing }"
                :disabled="post.processing"
              >
                <svg v-if="!post.processing" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="check-icon">
                  <polyline points="20 6 9 17 4 12" />
                </svg>
                <span v-if="!post.processing">Approve</span>
                <span v-else>Processing...</span>
              </button>
              <button
                class="reject-button"
                @click="rejectPost(post.id)"
                :disabled="post.processing"
              >
                Reject
              </button>
            </div>
          </div>
        </div>
      </section>
    </main>
  </div>
</template>

<script setup>
import { ref } from 'vue';

import cat1 from '../assets/gray-striped-cat.jpg';
import cat2 from '../assets/gray-white-cat.jpeg';
import cat3 from '../assets/black-white-cat.jpg';
import cat4 from '../assets/orange-cat.jpeg';
import dog1 from '../assets/puppy.jpg';

const pendingPosts = ref([
  {
    id: 1,
    image: cat1,
    description: 'Our indoor cat Mimi slipped out through a window and hasn\'t returned. She is shy, especially around strangers...',
    features: 'gray, striped',
    location: 'Herăstrău Park, near Șoseaua Nordului',
    date: 'Mon, 29.04.2025',
    processing: false
  },
  {
    id: 2,
    image: cat2,
    description: 'A gray and white cat was found hiding under a parked car. It seems well-fed and tame, likely someone\'s pet...',
    features: 'gray, striped',
    location: 'Intrarea Violoncelului, Sector 4',
    date: 'Tue, 30.04.2025',
    processing: false
  },
  {
    id: 3,
    image: cat3,
    description: 'Found a young white and black cat meowing outside our apartment block. She seems frightened but friendly...',
    features: 'white, striped',
    location: 'Bulevardul Timișoara, Sector 6',
    date: 'Tue, 30.04.2025',
    processing: false
  },
  {
    id: 4,
    image: cat4,
    description: 'Leo disappeared during the night. He\'s curious and friendly, but easily startled by loud noises...',
    features: 'tiny, orange',
    location: 'Intrarea Violoncelului, Sector 4',
    date: 'Wed, 31.04.2025',
    processing: false
  },
  {
    id: 5,
    image: dog1,
    description: 'Tasha is missing. She slipped out during renovations and hasn\'t been seen since. She\'s neutered and microchipped...',
    features: 'brown, medium-sized',
    location: 'Șoseaua Pantelimon, near Mega Mall',
    date: 'Wed, 31.04.2025',
    processing: false
  }
]);

const approvePost = (postId) => {
  const post = pendingPosts.value.find(p => p.id === postId);
  if (post) {
    post.processing = true;

    setTimeout(() => {
      pendingPosts.value = pendingPosts.value.filter(p => p.id !== postId);
      console.log(`Post ${postId} approved`);
    }, 1000);
  }
};

const rejectPost = (postId) => {
  pendingPosts.value = pendingPosts.value.filter(p => p.id !== postId);
  console.log(`Post ${postId} rejected`);
};
</script>

<style scoped>
/* Base styles */
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

.admin-dashboard {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
  font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
  background-color: #f5f5f5;
}

/* Header styles */
.header {
  display: flex;
  align-items: center;
  padding: 0.75rem 1.5rem;
  background-color: white;
  border-bottom: 1px solid #e5e7eb;
  box-shadow: 0 1px 3px rgba(0, 0, 0, 0.1);
}

.logo {
  display: flex;
  align-items: center;
  margin-right: 2rem;
}

.logo-icon {
  display: flex;
  align-items: center;
  justify-content: center;
  color: #3b82f6;
  width: 24px;
  height: 24px;
  margin-right: 0.5rem;
}

.paw-icon {
  width: 100%;
  height: 100%;
  color: #3b82f6;
}

.logo-text {
  font-weight: 700;
  font-size: 1.25rem;
  color: #3b82f6;
}

.search-container {
  flex: 1;
  max-width: 600px;
}

.search-bar {
  display: flex;
  align-items: center;
  background-color: #f3f4f6;
  border-radius: 9999px;
  padding: 0.5rem 1rem;
}

.search-icon {
  width: 18px;
  height: 18px;
  color: #9ca3af;
  margin-right: 0.5rem;
}

.search-input {
  flex: 1;
  border: none;
  background: transparent;
  outline: none;
  font-size: 0.875rem;
  color: #374151;
}

.action-buttons {
  display: flex;
  align-items: center;
  margin-left: 1.5rem;
}

.post-button {
  background-color: #3b82f6;
  color: white;
  border: none;
  border-radius: 9999px;
  padding: 0.5rem 1.25rem;
  font-weight: 500;
  font-size: 0.875rem;
  cursor: pointer;
  margin-right: 1.5rem;
  transition: background-color 0.2s;
}

.post-button:hover {
  background-color: #2563eb;
}

.login-link {
  text-decoration: none;
  color: #374151;
  font-weight: 500;
  font-size: 0.875rem;
}

/* Main content styles */
.main-content {
  flex: 1;
  padding: 1.5rem;
  max-width: 1200px;
  margin: 0 auto;
  width: 100%;
}

/* Admin profile styles */
.admin-profile {
  display: flex;
  align-items: center;
  margin-bottom: 2rem;
}

.admin-avatar {
  width: 48px;
  height: 48px;
  border-radius: 50%;
  overflow: hidden;
  margin-right: 1rem;
}

.admin-avatar img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.admin-title {
  font-size: 1.5rem;
  font-weight: 600;
  color: #111827;
}

/* New posts section styles */
.new-posts-section {
  background-color: #f5f5f5;
  border-radius: 0.5rem;
}

.section-title {
  font-size: 1.25rem;
  font-weight: 600;
  color: #111827;
  margin-bottom: 1rem;
}

.posts-list {
  display: flex;
  flex-direction: column;
  gap: 1rem;
}

.post-card {
  display: flex;
  background-color: white;
  border-radius: 0.5rem;
  overflow: hidden;
  box-shadow: 0 1px 3px rgba(0, 0, 0, 0.1);
  padding: 1rem;
}

.post-image {
  width: 120px;
  height: 120px;
  border-radius: 0.375rem;
  overflow: hidden;
  margin-right: 1rem;
  flex-shrink: 0;
}

.post-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.post-content {
  flex: 1;
  display: flex;
  flex-direction: column;
  font-size: 0.875rem;
}

.post-description {
  font-size: 0.875rem;
  line-height: 1.25rem;
  color: #1f2937;
  margin-bottom: 0.5rem;
}

.post-features {
  font-size: 0.75rem;
  color: #4b5563;
  margin-bottom: 0.5rem;
}

.post-location {
  display: flex;
  align-items: center;
  color: #4b5563;
  margin-bottom: 0.25rem;
  font-size: 0.75rem;
}

.location-icon {
  width: 14px;
  height: 14px;
  color: #3b82f6;
  margin-right: 0.25rem;
}

.post-date {
  color: #6b7280;
  font-size: 0.75rem;
}

.post-actions {
  display: flex;
  flex-direction: column;
  gap: 0.5rem;
  margin-left: 1rem;
  justify-content: center;
}

.approve-button, .reject-button {
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 0.375rem 0.75rem;
  border-radius: 0.375rem;
  font-size: 0.75rem;
  font-weight: 500;
  cursor: pointer;
  transition: background-color 0.2s;
  min-width: 100px;
}

.approve-button {
  background-color: #e0e7ff;
  color: #4f46e5;
  border: 1px solid #e0e7ff;
}

.approve-button:hover {
  background-color: #c7d2fe;
}

.approve-button.processing {
  opacity: 0.7;
  cursor: not-allowed;
}

.reject-button {
  background-color: white;
  color: #4b5563;
  border: 1px solid #e5e7eb;
}

.reject-button:hover {
  background-color: #f3f4f6;
}

.check-icon {
  width: 14px;
  height: 14px;
  margin-right: 0.25rem;
}

/* Responsive styles */
@media (max-width: 768px) {
  .header {
    flex-wrap: wrap;
    padding: 0.5rem 1rem;
  }

  .logo {
    margin-right: 1rem;
  }

  .search-container {
    order: 3;
    width: 100%;
    max-width: none;
    margin-top: 0.5rem;
  }

  .post-card {
    flex-direction: column;
  }

  .post-image {
    width: 100%;
    height: 180px;
    margin-right: 0;
    margin-bottom: 1rem;
  }

  .post-actions {
    flex-direction: row;
    margin-left: 0;
    margin-top: 1rem;
  }

  .approve-button, .reject-button {
    flex: 1;
  }
}
</style>