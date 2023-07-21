import { Home, SignIn, SignUp, Profile, Event, About, Donate, Service, Donate_One, Donate_Monthly} from "@/pages";
import {
  HomeIcon,
  CalendarDaysIcon,
  PhoneIcon,
  HeartIcon,
  ArrowRightOnRectangleIcon,
  CurrencyDollarIcon,
  UserPlusIcon,
} from "@heroicons/react/24/solid";
import Contact from "./pages/contact";
export const routes = [
  // ok
  {
    icon: HomeIcon,
    name: "home",
    path: "/home",
    element: <Home />,
  },
  {
    //oki
    icon: CalendarDaysIcon,
    name: "events",
    path: "/event",
    element: <Event />,
  },
  {
    icon: ArrowRightOnRectangleIcon,
    name: "services",
    path: "/service",
    element: <Service />,
  },
  {
    //oki
    icon: UserPlusIcon,
    name: "about",
    path: "/about",
    element: <About />,
  },
  {

    icon: PhoneIcon,
    name: "Contact",
    path: "/contact",
    element: <Contact/>,
  },
  {
    icon: HeartIcon,
    name: "Donate",
    path: "/donate",
    element: <Donate />,
  },
  {
    icon: CurrencyDollarIcon,
    name: "Donate One",
    path: "/donate_one",
    element: <Donate_One />,
  },
  {
    icon: CurrencyDollarIcon,
    name: "Donate Monthly",
    path: "/donate_monthly",
    element: <Donate_Monthly />,
  },
  {
    icon: UserPlusIcon,
    name: "SignIn",
    path: "/signin",
    element: <SignIn/>,
  }
];

export default routes;
