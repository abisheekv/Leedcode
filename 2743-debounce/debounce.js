var debounce = function(fn, t) {
    let timer = null;

    return function(...args) {
        // Cancel previous timer
        if (timer) {
            clearTimeout(timer);
        }

        // Set new timer
        timer = setTimeout(() => {
            fn(...args);
        }, t);
    };
};