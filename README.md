# Concurrent programming in Action
## Introduction

Concurrent programming  allows you to execute tasks without pending the main thread, improving responsiveness and efficiency.

1. **Concurrency vs. Waiting**:
    Concurrent execution means your task runs in a separate thread (like a mini-program) alongside the main thread. The main thread doesn't wait for the task to finish before continuing.
2. **Creating Concurrent Tasks**:
   There are two main approaches in Java:</br>
        a- Threads: You can directly create new threads with the Thread class and submit your task (runnable code) to that thread. </br>
        b- Executor Services: These manage a pool of pre-created threads. You submit your task to the service, and an available thread from the pool executes it. This is generally preferred as it simplifies thread management.

3. **Tasks and Interfaces**:
  You should implement the Runnable interface (for tasks without a return value) or the Callable interface (for tasks that return a value).
4. **Execution Timing**: When you submit your task, it gets queued for execution. The actual execution might happen immediately or later, depending on available threads and scheduling. This is crucial because the main thread continues running without waiting.

### Note: While asynchronous programming often utilizes concurrent features, they are distinct concepts. Asynchronous programming focuses on handling operations later and not executing the operation immediately.
