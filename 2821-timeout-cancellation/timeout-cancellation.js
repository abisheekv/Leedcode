var cancellable = function(fn, args, t) {
    
    // Start timer
    const timerId = setTimeout(() => {
        fn(...args);
    }, t);

    // Return cancel function
    return function cancelFn() {
        clearTimeout(timerId);
    };
};