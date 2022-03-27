package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatUserRepo extends JpaRepository<ChatUser, Long>
{
    ChatUser findByUsername(String username);
}

