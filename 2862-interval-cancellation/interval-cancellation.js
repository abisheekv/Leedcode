var cancellable = function(fn, args, t) {
    // call immediately
    fn(...args);

    // start interval
    const intervalId = setInterval(() => {
        fn(...args);
    }, t);

    // return cancel function
    return function cancelFn() {
        clearInterval(intervalId);
    };
};