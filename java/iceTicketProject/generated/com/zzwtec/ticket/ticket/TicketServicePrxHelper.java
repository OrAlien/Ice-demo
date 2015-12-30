// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.1
//
// <auto-generated>
//
// Generated from file `TicketServer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.zzwtec.ticket.ticket;

/**
 * 票务服务接口
 **/
public final class TicketServicePrxHelper extends Ice.ObjectPrxHelperBase implements TicketServicePrx
{
    private static final String __cancleOrder_name = "cancleOrder";

    /**
     * 取消订单
     **/
    public boolean cancleOrder(long orderId)
    {
        return cancleOrder(orderId, null, false);
    }

    /**
     * 取消订单
     * @param __ctx The Context map to send with the invocation.
     **/
    public boolean cancleOrder(long orderId, java.util.Map<String, String> __ctx)
    {
        return cancleOrder(orderId, __ctx, true);
    }

    private boolean cancleOrder(long orderId, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__cancleOrder_name);
        return end_cancleOrder(begin_cancleOrder(orderId, __ctx, __explicitCtx, true, null));
    }

    /**
     * 取消订单
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_cancleOrder(long orderId)
    {
        return begin_cancleOrder(orderId, null, false, false, null);
    }

    /**
     * 取消订单
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_cancleOrder(long orderId, java.util.Map<String, String> __ctx)
    {
        return begin_cancleOrder(orderId, __ctx, true, false, null);
    }

    /**
     * 取消订单
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_cancleOrder(long orderId, Ice.Callback __cb)
    {
        return begin_cancleOrder(orderId, null, false, false, __cb);
    }

    /**
     * 取消订单
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_cancleOrder(long orderId, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_cancleOrder(orderId, __ctx, true, false, __cb);
    }

    /**
     * 取消订单
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_cancleOrder(long orderId, Callback_TicketService_cancleOrder __cb)
    {
        return begin_cancleOrder(orderId, null, false, false, __cb);
    }

    /**
     * 取消订单
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_cancleOrder(long orderId, java.util.Map<String, String> __ctx, Callback_TicketService_cancleOrder __cb)
    {
        return begin_cancleOrder(orderId, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_cancleOrder(long orderId, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_cancleOrder(orderId, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_cancleOrder(long orderId, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_cancleOrder(orderId, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_cancleOrder(long orderId, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_cancleOrder(orderId, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_cancleOrder(long orderId, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_cancleOrder(orderId, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_cancleOrder(long orderId, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.Functional_BoolCallback __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_cancleOrder(orderId, __ctx, __explicitCtx, __synchronous, 
                                 new IceInternal.Functional_TwowayCallbackBool(__responseCb, __exceptionCb, __sentCb)
                                     {
                                         public final void __completed(Ice.AsyncResult __result)
                                         {
                                             TicketServicePrxHelper.__cancleOrder_completed(this, __result);
                                         }
                                     });
    }

    private Ice.AsyncResult begin_cancleOrder(long orderId, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__cancleOrder_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__cancleOrder_name, __cb);
        try
        {
            __result.prepare(__cancleOrder_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeLong(orderId);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public boolean end_cancleOrder(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __cancleOrder_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            boolean __ret;
            __ret = __is.readBool();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __cancleOrder_completed(Ice.TwowayCallbackBool __cb, Ice.AsyncResult __result)
    {
        com.zzwtec.ticket.ticket.TicketServicePrx __proxy = (com.zzwtec.ticket.ticket.TicketServicePrx)__result.getProxy();
        boolean __ret = false;
        try
        {
            __ret = __proxy.end_cancleOrder(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __createOrder_name = "createOrder";

    /**
     * 下单
     **/
    public boolean createOrder(Order myOrder)
    {
        return createOrder(myOrder, null, false);
    }

    /**
     * 下单
     * @param __ctx The Context map to send with the invocation.
     **/
    public boolean createOrder(Order myOrder, java.util.Map<String, String> __ctx)
    {
        return createOrder(myOrder, __ctx, true);
    }

    private boolean createOrder(Order myOrder, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__createOrder_name);
        return end_createOrder(begin_createOrder(myOrder, __ctx, __explicitCtx, true, null));
    }

    /**
     * 下单
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_createOrder(Order myOrder)
    {
        return begin_createOrder(myOrder, null, false, false, null);
    }

    /**
     * 下单
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_createOrder(Order myOrder, java.util.Map<String, String> __ctx)
    {
        return begin_createOrder(myOrder, __ctx, true, false, null);
    }

    /**
     * 下单
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_createOrder(Order myOrder, Ice.Callback __cb)
    {
        return begin_createOrder(myOrder, null, false, false, __cb);
    }

    /**
     * 下单
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_createOrder(Order myOrder, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_createOrder(myOrder, __ctx, true, false, __cb);
    }

    /**
     * 下单
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_createOrder(Order myOrder, Callback_TicketService_createOrder __cb)
    {
        return begin_createOrder(myOrder, null, false, false, __cb);
    }

    /**
     * 下单
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_createOrder(Order myOrder, java.util.Map<String, String> __ctx, Callback_TicketService_createOrder __cb)
    {
        return begin_createOrder(myOrder, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_createOrder(Order myOrder, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_createOrder(myOrder, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_createOrder(Order myOrder, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_createOrder(myOrder, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_createOrder(Order myOrder, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_createOrder(myOrder, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_createOrder(Order myOrder, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_BoolCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_createOrder(myOrder, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_createOrder(Order myOrder, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.Functional_BoolCallback __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_createOrder(myOrder, __ctx, __explicitCtx, __synchronous, 
                                 new IceInternal.Functional_TwowayCallbackBool(__responseCb, __exceptionCb, __sentCb)
                                     {
                                         public final void __completed(Ice.AsyncResult __result)
                                         {
                                             TicketServicePrxHelper.__createOrder_completed(this, __result);
                                         }
                                     });
    }

    private Ice.AsyncResult begin_createOrder(Order myOrder, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__createOrder_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__createOrder_name, __cb);
        try
        {
            __result.prepare(__createOrder_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            Order.__write(__os, myOrder);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public boolean end_createOrder(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __createOrder_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            boolean __ret;
            __ret = __is.readBool();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __createOrder_completed(Ice.TwowayCallbackBool __cb, Ice.AsyncResult __result)
    {
        com.zzwtec.ticket.ticket.TicketServicePrx __proxy = (com.zzwtec.ticket.ticket.TicketServicePrx)__result.getProxy();
        boolean __ret = false;
        try
        {
            __ret = __proxy.end_createOrder(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __queryMyOrders_name = "queryMyOrders";

    /**
     * 查询订单
     **/
    public Order[] queryMyOrders(String phone)
    {
        return queryMyOrders(phone, null, false);
    }

    /**
     * 查询订单
     * @param __ctx The Context map to send with the invocation.
     **/
    public Order[] queryMyOrders(String phone, java.util.Map<String, String> __ctx)
    {
        return queryMyOrders(phone, __ctx, true);
    }

    private Order[] queryMyOrders(String phone, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__queryMyOrders_name);
        return end_queryMyOrders(begin_queryMyOrders(phone, __ctx, __explicitCtx, true, null));
    }

    /**
     * 查询订单
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_queryMyOrders(String phone)
    {
        return begin_queryMyOrders(phone, null, false, false, null);
    }

    /**
     * 查询订单
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_queryMyOrders(String phone, java.util.Map<String, String> __ctx)
    {
        return begin_queryMyOrders(phone, __ctx, true, false, null);
    }

    /**
     * 查询订单
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_queryMyOrders(String phone, Ice.Callback __cb)
    {
        return begin_queryMyOrders(phone, null, false, false, __cb);
    }

    /**
     * 查询订单
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_queryMyOrders(String phone, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_queryMyOrders(phone, __ctx, true, false, __cb);
    }

    /**
     * 查询订单
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_queryMyOrders(String phone, Callback_TicketService_queryMyOrders __cb)
    {
        return begin_queryMyOrders(phone, null, false, false, __cb);
    }

    /**
     * 查询订单
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_queryMyOrders(String phone, java.util.Map<String, String> __ctx, Callback_TicketService_queryMyOrders __cb)
    {
        return begin_queryMyOrders(phone, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_queryMyOrders(String phone, 
                                               IceInternal.Functional_GenericCallback1<Order[]> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_queryMyOrders(phone, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_queryMyOrders(String phone, 
                                               IceInternal.Functional_GenericCallback1<Order[]> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryMyOrders(phone, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_queryMyOrders(String phone, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<Order[]> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_queryMyOrders(phone, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_queryMyOrders(String phone, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<Order[]> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryMyOrders(phone, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_queryMyOrders(String phone, 
                                                java.util.Map<String, String> __ctx, 
                                                boolean __explicitCtx, 
                                                boolean __synchronous, 
                                                IceInternal.Functional_GenericCallback1<Order[]> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_queryMyOrders(phone, __ctx, __explicitCtx, __synchronous, 
                                   new IceInternal.Functional_TwowayCallbackArg1<com.zzwtec.ticket.ticket.Order[]>(__responseCb, __exceptionCb, __sentCb)
                                       {
                                           public final void __completed(Ice.AsyncResult __result)
                                           {
                                               TicketServicePrxHelper.__queryMyOrders_completed(this, __result);
                                           }
                                       });
    }

    private Ice.AsyncResult begin_queryMyOrders(String phone, 
                                                java.util.Map<String, String> __ctx, 
                                                boolean __explicitCtx, 
                                                boolean __synchronous, 
                                                IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__queryMyOrders_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__queryMyOrders_name, __cb);
        try
        {
            __result.prepare(__queryMyOrders_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(phone);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public Order[] end_queryMyOrders(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __queryMyOrders_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            Order[] __ret;
            __ret = OrderSeqHelper.read(__is);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __queryMyOrders_completed(Ice.TwowayCallbackArg1<Order[]> __cb, Ice.AsyncResult __result)
    {
        com.zzwtec.ticket.ticket.TicketServicePrx __proxy = (com.zzwtec.ticket.ticket.TicketServicePrx)__result.getProxy();
        Order[] __ret = null;
        try
        {
            __ret = __proxy.end_queryMyOrders(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    public static TicketServicePrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), TicketServicePrx.class, TicketServicePrxHelper.class);
    }

    public static TicketServicePrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), TicketServicePrx.class, TicketServicePrxHelper.class);
    }

    public static TicketServicePrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), TicketServicePrx.class, TicketServicePrxHelper.class);
    }

    public static TicketServicePrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), TicketServicePrx.class, TicketServicePrxHelper.class);
    }

    public static TicketServicePrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, TicketServicePrx.class, TicketServicePrxHelper.class);
    }

    public static TicketServicePrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, TicketServicePrx.class, TicketServicePrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::ticket::TicketService"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, TicketServicePrx v)
    {
        __os.writeProxy(v);
    }

    public static TicketServicePrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            TicketServicePrxHelper result = new TicketServicePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
