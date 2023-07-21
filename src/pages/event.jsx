// import { Footer } from "@/widgets/layout";

// export function Event()
// {
//     return(
//     <>
//     {/* intro */}
   

//     {/* footer */}
//     <div className="bg-blue-gray-50/50">
//         <Footer />
//     </div>
//     </>
// );
// }

// export default Event;
import { Avatar, Typography, Button } from "@material-tailwind/react";
import {
  MapPinIcon,
  BriefcaseIcon,
  BuildingLibraryIcon,
} from "@heroicons/react/24/solid";
import { Footer, PageTitle } from "@/widgets/layout";
// import { evenData} from "@/data/event-data";
// import {EventCard} from "@/widgets/cards";
export function Event() {
  return (
    <>
    {/* <section className="px-4 pt-20 pb-30">
      <div className="container mx-auto">
        <div className="mt-24 grid grid-cols-1 gap-12 gap-x-24 md:grid-cols-2 xl:grid-cols-4">
            {evenData.map(({ arcticle_id, event_id, event_title, event_description, start_date, end_date, img}) => (
              <Event
                Fkey={arcticle_id}
                key={event_id}
                title={event_title}
                start_date={start_date}
                end_date={end_date}
                img={img}
                description={event_description}
                // socials={
                //   <div className="flex items-center gap-2">
                //     {socials.map(({ color, name }) => (
                //       <IconButton key={name} color={color} variant="text">
                //         <i className={`fa-brands text-lg fa-${name}`} />
                //       </IconButton>
                //     ))}
                //   </div>
                // }
              />
            ))}
          </div>
      </div>
    </section> */}
      <section className="relative block h-[50vh]">
        <div className="bg-profile-background absolute top-0 h-full w-full bg-[url('/img/tre_em1.jpg')] bg-cover bg-center" />
        <div className="absolute top-0 h-full w-full bg-black/75 bg-cover bg-center" />
      </section>
      <section className="relative bg-blue-gray-50/50 py-16 px-4">
        <div className="container mx-auto">
          <div className="relative mb-6 -mt-64 flex w-full min-w-0 flex-col break-words rounded-3xl bg-white shadow-xl shadow-gray-500/5">
            <div className="px-6">

              <div className="my-8 text-center">
                <Typography variant="h2" color="blue-gray" className="mb-2">
                Our Signature Events
                </Typography>
                <div className="mb-2 flex items-center justify-center gap-2">
                  <Typography className="font-medium text-blue-gray-700">
                    Ngay 19/7/2023
                  </Typography>
                </div>
              </div>

              <div className="mb-10 border-t border-blue-gray-50 py-6 text-center">
                <div className="mt-2 flex flex-wrap justify-center">
                  <div className="flex w-full flex-col items-center px-4 lg:w-12/12">
                    <Typography className="mb-8 font-normal text-blue-gray-500">
                    The Child Protection Center (CPC) has two major signature events annually — Cook for Courage 
                    in May and Holidays in Crestwood in November/December.
                    As a national accredited child advocacy center, we support Child Abuse Prevention Month in April. 
                    In addition, we recognize a variety of events related to child abuse and child witnesses of violence, 
                    including National Domestic Violence Month in October.
                    </Typography>
                    <Button variant="text">Show more</Button>
                  </div>
                </div>
              </div>

            </div>
          </div>
        </div>
      </section>
      {/* list danh sach */}
      <section className="px-4 pt-20 pb-20"> 
        <div className="container mx-auto">
          <PageTitle heading="EVENTS LIST"></PageTitle>
        </div>
        <div className="w-full bg-white py-4 px-2">
          <div className="max-w-[1240px] mx-auto grid md:grid-cols-2">
          <img className="w-[400px] mx-auto my-4" src="/img/tre_em1.jpg" alt="/"></img>
          <div >
          <p className="text-[#331D2C] font-bold text-uppercase">Our Signature Events</p>
                <div>                   
                  <h1 className="">Ngày 19/07/2023</h1><br></br>
                  </div>  
                              
                  <p>The Child Protection Center (CPC) has two major signature events annually — Cook for Courage in May and Holidays in Crestwood in November/December.
                  As a national accredited child advocacy center, we support Child Abuse Prevention Month in April.
                  In addition, we recognize a variety of events related to child abuse and child witnesses of violence, including National Domestic Violence Month in October....</p>
                  <br></br>
                  <button className="bg-[#00df9a] w-[200px] rounded-md font-medium my-6 mx-auto py-3 text-black">Read more</button>
          </div>
          </div>
        </div>
        <div className="w-full bg-white py-4 px-2">
          <div className="max-w-[1240px] mx-auto grid md:grid-cols-2">
          <img className="w-[400px] mx-auto my-4" src="/img/tre_em1.jpg" alt="/"></img>
          <div >
          <p className="text-[#331D2C] font-bold text-uppercase">Our Signature Events</p>
                <div>                   
                  <h1 className="">Ngày 19/07/2023</h1><br></br>
                  </div>  
                              
                  <p>The Child Protection Center (CPC) has two major signature events annually — Cook for Courage in May and Holidays in Crestwood in November/December.
                  As a national accredited child advocacy center, we support Child Abuse Prevention Month in April.
                  In addition, we recognize a variety of events related to child abuse and child witnesses of violence, including National Domestic Violence Month in October....</p>
                  <br></br>
                  <button className="bg-[#00df9a] w-[200px] rounded-md font-medium my-6 mx-auto py-3 text-black">Read more</button>
          </div>
          </div>
        </div>
        <div className="w-full bg-white py-4 px-2">
          <div className="max-w-[1240px] mx-auto grid md:grid-cols-2">
          <img className="w-[400px] mx-auto my-4" src="/img/tre_em1.jpg" alt="/"></img>
          <div >
          <p className="text-[#331D2C] font-bold text-uppercase">Our Signature Events</p>
                <div>                   
                  <h1 className="">Ngày 19/07/2023</h1><br></br>
                  </div>  
                              
                  <p>The Child Protection Center (CPC) has two major signature events annually — Cook for Courage in May and Holidays in Crestwood in November/December.
                  As a national accredited child advocacy center, we support Child Abuse Prevention Month in April.
                  In addition, we recognize a variety of events related to child abuse and child witnesses of violence, including National Domestic Violence Month in October....</p>
                  <br></br>
                  <button className="bg-[#00df9a] w-[200px] rounded-md font-medium my-6 mx-auto py-3 text-black">Read more</button>
          </div>
          </div>
        </div>
      </section>


      {/* footer */}
      <div className="bg-blue-gray-50/50">
        <Footer />
      </div>
    </>
  );
}

export default Event;
