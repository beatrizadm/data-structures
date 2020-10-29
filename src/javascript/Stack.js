class Stack {
    constructor() {
        this.items = [];
    }

    push(element) {
        this.items[this.items.length] = element;
    }

    pop() {
        if(this.isEmpty()) {
            throw Error("StackUnderflow");
        }
        return this.items.pop();
    }

    peek() {
        return this.items[this.items.length - 1];
    }

    isEmpty() {
        return this.items.length === 0;
    }
}