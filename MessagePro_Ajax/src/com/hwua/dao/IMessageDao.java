package com.hwua.dao;

import java.sql.SQLException;
import java.util.List;

import com.hwua.entity.Message;

public interface IMessageDao {
    public List<Message> query(int receiveid,int start,int pageSize) throws SQLException;
    public Message query(String id) throws SQLException;
    public int update(Message msg) throws SQLException;
    public int save(Message msg) throws SQLException;
    public int delete(int id) throws SQLException;
    public Long queryCount(int receiveid) throws SQLException;
}
