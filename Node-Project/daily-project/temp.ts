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

abstract class People {
  abstract skill(): void;
}
class Boy extends People {
  skill() {
    console.log('haha');
  }
}
console.log(new Boy());

// 枚举类型使用
enum Status {
  'unfinished',
  'doing',
  'done'
}

console.log(Status[1]);
console.log(Status.unfinished);

// 泛型
function join<T>(first: T, second: T) {
  return `${first}${second}`;
}
console.log(join<string>('hello', 'kaifa'));

class ElectMonitor<T extends number | string> {
  constructor(private candidates: T[]) {}

  getCandidate(index: number): T {
    return this.candidates[index];
  }
}
const electMonitor = new ElectMonitor<string>(['小明', '小丽', '小方']);
console.log(electMonitor.getCandidate(1));

