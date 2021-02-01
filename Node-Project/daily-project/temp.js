"use strict";
// class People {
//   constructor(public name: string) {}
// }
// class Boy extends People {
//   constructor(public age: number) {
//     super('haha');
//   }
//
// }
// const man = new People('dd');
// const boy = new Boy(12)
// console.log(man);
// console.log(boy)
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// class People {
//   constructor(private _name: string) {}
//
//   get name() {
//     return this._name;
//   }
//
//   set name(name: string) {
//     this._name = name;
//   }
// }
// const man = new People('bob');
// man.name = 'alice';
// console.log(man.name);
var People = /** @class */ (function () {
    function People() {
    }
    return People;
}());
var Boy = /** @class */ (function (_super) {
    __extends(Boy, _super);
    function Boy() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Boy.prototype.skill = function () {
        console.log('haha');
    };
    return Boy;
}(People));
console.log(new Boy());
// 枚举类型使用
var Status;
(function (Status) {
    Status[Status["unfinished"] = 0] = "unfinished";
    Status[Status["doing"] = 1] = "doing";
    Status[Status["done"] = 2] = "done";
})(Status || (Status = {}));
console.log(Status[1]);
console.log(Status.unfinished);
// 泛型
function join(first, second) {
    return "" + first + second;
}
console.log(join('hello', 'kaifa'));
var ElectMonitor = /** @class */ (function () {
    function ElectMonitor(candidates) {
        this.candidates = candidates;
    }
    ElectMonitor.prototype.getCandidate = function (index) {
        return this.candidates[index];
    };
    return ElectMonitor;
}());
var electMonitor = new ElectMonitor(['小明', '小丽', '小方']);
console.log(electMonitor.getCandidate(1));
