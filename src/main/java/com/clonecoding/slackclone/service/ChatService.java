//package com.clonecoding.slackclone.service;
//
//import com.clonecoding.slackclone.model.ChatRoom;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import javax.persistence.PostRemove;
//import java.util.*;
//
//@Service
//// Slf4j이게 뭘까? (Simple Logging Faced for Java : 로그를 확인해서 찍는 어노테이션
//@Slf4j
//@RequiredArgsConstructor
//public class ChatService {
//
//    private Map<String, ChatRoom> chatRooms;
//
//    @PostConstruct
//    // 의존관계 주입완료되면 실행되는 코드
//    private void init() {
//        chatRooms = new LinkedHashMap<>();
//    }
//    // 채팅방 불러오기
//    public List<ChatRoom> findAllRoom() {
//        // 채팅방 최근 생성 순으로 반환
//        List<ChatRoom> result = new ArrayList<>(chatRooms.values());
//        Collections.reverse(result);
//
//        return result;
//    }
//    // 채팅방 하나 불러오기
//    public ChatRoom findById(String roomId) {
//        return chatRooms.get(roomId);
//    }
//    // 채팅방 생성
//    public ChatRoom createRoom(String name) {
//        ChatRoom chatRoom = ChatRoom.create(name);
//        chatRooms.put(chatRoom.getRoomId(), chatRoom);
//        return chatRoom;
//    }
//}
