package org.example.lld.pubSubQueue;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String msg;
    private String msgId;
}
