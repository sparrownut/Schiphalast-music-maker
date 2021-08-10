package com.stupidfish.cache

class ChartCache {
    companion object{
        /**
         * 铺面临时储存
         */
        val chartList:MutableList<NoteCache> = ArrayList()//铺面list
        fun addChart(note: NoteCache){
            chartList.add(note)
            //加入
        }
        fun removeChart(serial:Int){
            chartList.removeAt(serial)
            //删除
        }
    }
}