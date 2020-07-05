import Home from "./components/Home";
import User from "./components/user/User"
import UserBeta from "./components/user/UserBeta"

export const routes = [
    {path: "/", component: Home},
    {path: "/user", component: User},
    {path: "/user-beta", component: UserBeta},
    // CATCH ALL FALLBACK
    {path: "*", redirect: Home}
];
