import firebase from '@firebase/app'
export const UserList = () => {
  const userlist = firebase.database().ref().child("users")
  const arr = [];
  userlist.on('child_added', (snap) => {
    const { nickname, number, sex, city, profileUrl, selfIntro, age,sendId} = snap.val();
    arr.push({
      profileUrl,
      nickname,
      number,
      sex,
      sendId,
      selfIntro,
      age
    });
  });
    return arr
};
