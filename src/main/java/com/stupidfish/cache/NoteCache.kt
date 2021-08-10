package com.stupidfish.cache

import com.stupidfish.cache.NoteType.*

class NoteCache(typeF:NoteType,timeF:Int,BPMF:Int,yPosF:Int,endTF:Int,rsF:Int,rdF:Int) {
    /**
     * Note的存储类
     */
    var type:NoteType
    var time:Int
    var BPM:Int
    var yPos:Int
    var endT:Int
    var rs:Int
    var rd:Int
    init {
        this.type = typeF
        this.time = timeF
        this.BPM = BPMF
        this.yPos = yPosF
        this.endT = endTF
        this.rs = rsF
        this.rd = rdF
    }
}