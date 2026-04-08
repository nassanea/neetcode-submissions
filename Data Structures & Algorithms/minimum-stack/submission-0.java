class MinStack {
    Deque<Integer> s;
    Deque<Integer> extra;

    public MinStack() {
        this.s = new ArrayDeque<>();
        this.extra = new ArrayDeque<>();
        // extra 的元素數量不會和 s 一致
    }
    
    public void push(int val) {
        s.push(val); // stack 的還是正常 push，維持 LIFO

        if(extra.isEmpty() || val <= extra.peek()){
            extra.push(val);
            // extra 負責維護至今為止的最小值
            // 只需讓最小值有在 extra 裡面即可 其他無所謂
        }

        // // 對於維持 min 值的 extra stack，每次都進行比較
        // if(extra.isEmpty()){ // 先避免 extra 為空的情況
        //     extra.push(val);
        // }
        // if(val > this.s.peek()){ // 要加入的值並非當前最小值
        //     while(val > this.s.peek()){ 
        //         // 就要持續 pop 出來
        //         int temp = extra.pop();
        //         extra.push(val);
        //         extra.push(temp);
        //     }
        // }
        // else{ //是最小值
        //     extra.push(val);
        // }
    }
    
    public void pop() { 
        if(this.s.isEmpty()) return;

        int remove = s.pop();
        // 只有當 pop 的是最小值時才需要同時對 extra 操作移除
        if(remove == extra.peek()){
            extra.pop();
        }
        // if(!this.s.isEmpty() && !this.extra.isEmpty()){
        //     this.s.pop();
        //     //this.extra.pop();
        // }
    }
    
    public int top() { // top 邏輯不變
        return this.s.peek();
    }
    
    public int getMin() { // 類似於 top，但是是 extra 的 top
        return this.extra.peek();
    }
}
