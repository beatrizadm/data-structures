class Stack {
    constructor() {
        this.items = [];
        this.tail = -1;
    }

    push(element) {
        this.tail += 1;
        this.items[this.tail] = element;
    }

    pop() {
        if(this.isEmpty()) {
            throw Error("StackUnderflow");
        }
        const element = this.items[this.tail];
        this.tail -= 1;
        return element;
    }

    peek() {
        return this.items[this.tail];
    }

    isEmpty() {
        return this.tail === -1;
    }
}