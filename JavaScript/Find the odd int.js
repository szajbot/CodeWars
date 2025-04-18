function findOdd(A) {
    var occurrencesArray = [];
    function Occurrence(number, times) {
        this.number = number;
        this.times = times;
    };

    for (let i = 0; i < A.length; i++) {
        var existsInOccurrences = false;
        for (let k = 0; k < occurrencesArray.length; k++) {
            if (A[i] === occurrencesArray[k].number) {
                occurrencesArray[k].times = occurrencesArray[k].times + 1;
                existsInOccurrences = true;
            }
        };
        if(!existsInOccurrences) {
            var newOccurrence = new Occurrence(A[i], 1);
            occurrencesArray.push(newOccurrence)
        }
    };


    var result;
    for (let k = 0; k < occurrencesArray.length; k++) {
        if (occurrencesArray[k].times % 2 === 1) {
            result = occurrencesArray[k].number;
        }
    };

    return result;
}

function doTest(a, n) {
    console.log(findOdd(a) === n);
}

doTest([7], 7);